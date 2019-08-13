/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.systemregister.dao;

import br.com.systemregister.classes.RegisterClient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 801501279
 */
public class ClientDAO {

    public boolean checkLogin(String Login, String Senha) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM client WHERE Login = ? and Senha = ?");
            stmt.setString(1, Login);
            stmt.setString(2, Senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }

    public void create(RegisterClient u) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO Client (idClient,NameComplete,RGClient,DispatchingAgency,CPFClient,DateofBirth,GenderClient,PhoneClient,CellPhoneClient,EmailClient,CountryClient,CEPClient,StateClient,CityClient,DistrictClient,AddressClient,NumberHouse,ComplementHouse)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
            stmt.setInt(1, u.getIdClient());
            stmt.setString(2, u.getNameComplete());
            stmt.setString(3, u.getRgClient());
            stmt.setString(4, u.getDispatchingAgency());
            stmt.setString(5, u.getCpfClient());
            stmt.setString(6, u.getDateofBirth());
            stmt.setInt(7, u.getGenderClient());
            stmt.setString(8, u.getPhoneClient());
            stmt.setString(9, u.getCellPhoneClient());
            stmt.setString(10, u.getEmailClient());
            stmt.setString(11, u.getCountryClient());
            stmt.setString(12, u.getCepClient());
            stmt.setString(13, u.getStateClient());
            stmt.setString(14, u.getCityClient());
            stmt.setString(15, u.getDistrictClient());
            stmt.setString(16, u.getAddressClient());
            stmt.setString(17, u.getNumberHouse());
            stmt.setString(18, u.getComplementHouse());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<RegisterClient> read() {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<RegisterClient> clients = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM client");
            rs = stmt.executeQuery();

            while (rs.next()) {

                RegisterClient client = new RegisterClient();

                client.setIdClient(rs.getInt("idCliente"));
                client.setNameComplete(rs.getString("Nome"));
                client.setCpfClient(rs.getString("CPF"));
                client.setCityClient(rs.getString("Cidade"));
                client.setStateClient(rs.getString("Estado"));
                clients.add(client);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return clients;

    }

    public List<RegisterClient> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<RegisterClient> clients = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM client WHERE nome LIKE ?");
            stmt.setString(1, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                RegisterClient client = new RegisterClient();

                client.setIdClient(rs.getInt("idCliente"));
                client.setNameComplete(rs.getString("Nome"));
                client.setCpfClient(rs.getString("CPF"));
                client.setCityClient(rs.getString("Cidade"));
                client.setStateClient(rs.getString("Estado"));
                clients.add(client);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return clients;

    }

    public void update(RegisterClient u) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cliente SET PhoneClient = ? ,CellPhoneClient = ?,EmailClient = ?,CEPClient = ?,StateClient = ?,CityClient = ?,DistrictClient = ?,AddressClient = ?,NumberHouse = ?,ComplementHouse = ? WHERE idClient = ?");
            stmt.setString(1, u.getPhoneClient());
            stmt.setString(2, u.getCellPhoneClient());
            stmt.setString(3, u.getEmailClient());
            stmt.setString(4, u.getCepClient());
            stmt.setString(5, u.getStateClient());
            stmt.setString(6, u.getCityClient());
            stmt.setString(7, u.getDistrictClient());
            stmt.setString(8, u.getAddressClient());
            stmt.setString(9, u.getNumberHouse());
            stmt.setString(10, u.getComplementHouse());
            stmt.setInt(11, u.getIdClient());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void delete(RegisterClient u) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM client WHERE idClient = ?");
            stmt.setInt(1, u.getIdClient());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

}
