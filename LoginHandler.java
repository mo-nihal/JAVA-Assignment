public class LoginHandler {
    private User[] allusers = new User[3];

    public void AddUser(int index, User user)
    {
        allusers[index] = user;
    }

    public User GetUser(int index)
    {
        return allusers[index];
    }

    public int GetUserCount()
    {
        int count = 0;
        for (int i = 0; i < allusers.length; i++)
        {
            if (allusers[i] != null)
            {
                count++;
            }
        }

        return count;
    }

    //exception handling
    public String ReadUserInput(String msg)
    {
        //make holder variable
        String input = null;

        //read input
        input = System.console().readLine(msg);

        return input;
    }
}
