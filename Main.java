public class Main {
    public static void main(String[] args)
    {
        //Read User input
        String prompt = "Enter your name : ";
        String input = System.console().readLine(prompt);

        //create new User
        User newUser = new User(input);

        //Read user input for password
        String pwPrompt = "Welcome " + newUser.Username +  "!!" + " . Please set password : ";
        String pw = System.console().readLine(pwPrompt);
        newUser.SetPassword(pw);

        //Assign user to AllUsers collection
        LoginHandler handler = new LoginHandler();
        handler.AddUser(0, newUser);
        System.out.println(handler.GetUserCount()+ " Users in array");

        //Iterate through list and print Data for All Users
        for (int i = 0; i < handler.GetUserCount(); i++)
        {
            User current = handler.GetUser(i);

            if (current != null)
            {
                System.out.println("User " + i + " has username : " + current.Username + " and Password : " + current.GetPassword());
            }
        }
    }
}