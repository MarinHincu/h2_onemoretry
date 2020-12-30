import javax.swing.*;

public class Main {

    public static void main(String[] args) {

       // DBController.createUserDBTable();
/*        DBController.insertUserIntoDB("marinator","987354rfhr93548","marin","hincu",
                                        "weger weg 33 weg am weg","1999-03-05","all good",
                                        "public");*/

        DBController.displayListOfAllDBEntries();

        LoginDialog lg = new LoginDialog();
        lg.createLoginDialog();

    }
}
