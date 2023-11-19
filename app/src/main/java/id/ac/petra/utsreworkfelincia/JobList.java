package id.ac.petra.utsreworkfelincia;

public class JobList {
    int ID, Password, DueDate;
    String Username, Task;

    public JobList(String D12200034, String Felincia, String s, String AppDevelopment, String S1) {
        this.ID = ID;
        Username = Username;
        Password = Password;
        Task = Task;
        DueDate = DueDate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        Password = password;
    }

    public int getDueDate() {
        return DueDate;
    }

    public void setDueDate(int dueDate) {
        DueDate = dueDate;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getTask() {
        return Task;
    }

    public void setTask(String task) {
        Task = task;
    }
}
