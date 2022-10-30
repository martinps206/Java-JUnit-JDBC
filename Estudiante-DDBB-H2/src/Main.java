import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Martin Paliza Sanchez - JDBC");
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();
        System.out.println("Base de datos conectada....");

        verEstudiante(con);
        con.close();
        System.out.println("La cantidad de estudiantes: " + conexion.getListaEstudiantes().size());

    }

    static class Conexion{

        Conexion(){
            registrarDriver();
        }

        private void registrarDriver(){
            try {
                Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public Connection getConexion() throws Exception{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/estudiantes", "root", "");
            return connection;
        }

        public List<Estudiante> getListaEstudiantes() throws Exception{
            List<Estudiante> lista = new ArrayList<>();
            Connection con = getConexion();

            String sql = "SELECT * FROM ESTUDIANTE";
            Statement sqlSmt = con.createStatement();
            ResultSet rs = sqlSmt.executeQuery(sql);


            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM ESTUDIANTE");

            ResultSet r = preparedStatement.executeQuery();

            while(r.next()){
                Estudiante estudiante =new Estudiante();
                estudiante.setMatricula(r.getInt("matricula"));
                estudiante.setNombre(r.getString("nombre"));
                estudiante.setDireccion(r.getString("direccion"));
                lista.add(estudiante);
            }
            r.close();
            preparedStatement.close();


            con.close();
            return lista;
        }

    }

    static class Estudiante{
        private int matricula;
        private String nombre;
        private String direccion;

        public int getMatricula() {
            return matricula;
        }

        public void setMatricula(int matricula) {
            this.matricula = matricula;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
    }

    private static void verEstudiante(Connection connection) throws SQLException {
        String sql = "SELECT * FROM ESTUDIANTE";
        Statement sqlSmt = connection.createStatement();
        ResultSet rs = sqlSmt.executeQuery(sql);
        while (rs.next()) {

            System.out.println(rs.getInt(1) + " - "
                    + rs.getString(2) + " - " + rs.getString(3)  );
        }
    }

}