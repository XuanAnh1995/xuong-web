/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dethithu10_quanlyxemay.service;

import com.mycompany.dethithu10_quanlyxemay.model.XeMay;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class XeMayService {

    public ArrayList<XeMay> listXM = new ArrayList<>();

    DatabaseConnectionManager dcm = new DatabaseConnectionManager("PTPM_FINALLY_JAVA_SOF203", "sa", "123456789");
    Connection connection = null;
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public void loatDataTiTable(DefaultTableModel model) {
        try {
            model.setRowCount(0);

            connection = dcm.getConnection();
            String sql = """
                            SELECT Ma, Ten, GiaBan, SoLuong, TrangThai, (SoLuong * GiaBan) AS ThanhTien
                            FROM XeMay
                         """;
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String ma = resultSet.getString(1);
                String ten = resultSet.getString(2);
                double giaBan = resultSet.getDouble(3);
                int soLuong = resultSet.getInt(4);
                int trangThai = resultSet.getInt(5);
                double thanhTien = resultSet.getDouble(6);
                String trangThaiStr = "";
                if (trangThai == 1) {
                    trangThaiStr = "Xe cũ";
                } else {
                    trangThaiStr = "Xe mới";
                }

                model.addRow(new Object[]{
                    ma, ten, giaBan, soLuong, trangThaiStr, thanhTien
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public void InsertXM(XeMay xm) {
        try {
            connection = dcm.getConnection();
            String sql = """
                            INSERT INTO XeMay(Ma, Ten, GiaBan, SoLuong, TrangThai)
                            VALUES (?, ?, ?, ?, ?)
                         """;
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, xm.getMa());
            preparedStatement.setString(2, xm.getTen());
            preparedStatement.setDouble(3, xm.getGiaBan());
            preparedStatement.setInt(4, xm.getSoLuong());
            preparedStatement.setInt(5, xm.getTrangThai());

            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DeleteXM(String ma) {
        try {
            connection = dcm.getConnection();
            String sql = """
                            DELETE FROM XeMay
                            WHERE Ma = ?
                         """;
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ma);

            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void UpdateXM(XeMay xm) {
        try {
            connection = dcm.getConnection();
            String sql = """
                            UPDATE XeMay
                            SET Ten = ?, GiaBan = ?, SoLuong = ?, TrangThai = ?
                            WHERE Ma = ?
                         """;
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, xm.getTen());
            preparedStatement.setDouble(2, xm.getGiaBan());
            preparedStatement.setInt(3, xm.getSoLuong());
            preparedStatement.setInt(4, xm.getTrangThai());
            preparedStatement.setString(5, xm.getMa());

            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
