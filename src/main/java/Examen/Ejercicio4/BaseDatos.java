package Examen.Ejercicio4;
import java.util.List;
import java.util.LinkedList;

public class BaseDatos {
    private IOrdernar orderDB;
    private List<Usuario> usuarios = new LinkedList<Usuario>();

    public IOrdernar getOrderDB() {
        return orderDB;
    }

    public void setOrderDB(IOrdernar orderDB) {
        this.orderDB = orderDB;
    }

    public List<Usuario> getUsers() {
        return usuarios;
    }

    public void setUsers(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void ordering() {
        orderDB.orderUsers(usuarios);
    }
}
