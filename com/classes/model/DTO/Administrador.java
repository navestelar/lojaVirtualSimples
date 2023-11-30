public class Administrador {
    private int id;
    private int userId;
    public Administrador(int id, int userId) {
        this.id = id;
        this.userId = userId;
    }
    public Administrador() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    @Override
    public String toString() {
        return "Administrador [id=" + id + ", userId=" + userId + "]";
    }
}
