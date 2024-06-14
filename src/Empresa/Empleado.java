package Empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Empleado {

    public void agregarEmpleado(String nombre, String apellido, String puesto, double salario) {
        String sql = "INSERT INTO empleados (nombre, apellido, puesto, salario) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexionDB.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.setString(2, apellido);
            pstmt.setString(3, puesto);
            pstmt.setDouble(4, salario);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarEmpleado(int id, String nombre, String apellido, String puesto, double salario) {
        String sql = "UPDATE empleados SET nombre = ?, apellido = ?, puesto = ?, salario = ? WHERE id = ?";

        try (Connection conn = ConexionDB.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.setString(2, apellido);
            pstmt.setString(3, puesto);
            pstmt.setDouble(4, salario);
            pstmt.setInt(5, id);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void obtenerEmpleadoPorId(int id) {
        String sql = "SELECT * FROM empleados WHERE id = ?";

        try (Connection conn = ConexionDB.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Apellido: " + rs.getString("apellido"));
                System.out.println("Puesto: " + rs.getString("puesto"));
                System.out.println("Salario: " + rs.getDouble("salario"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}