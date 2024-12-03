package filkom.apps.torseba;
import filkom.apps.torseba.util.*;
import java.util.*;

/**
 * <h1>Torseba Main App</h1>
 * 
 * @author Syafa Hadyan Rasendriya
 */
public class Main
{
    static GeneratePage generatePage = new GeneratePage();
    static DataStruct getData = new DataStruct();
    static Scanner input = new Scanner(System.in);
    /*
     * Email
     * Password
     * No telfon
     * Nama
     * Role
     * Umur
     * Jenis kelamin
     * Alamat
     */
    public static void main(String[] args)
    {
        /*
         * "Email", key
         * "Password",
         * "Role",
         * "Nama",
         * "Alamat",
         * "Telepon",
         * "Jenis Kelamin",
         * "Tempat, tanggal lahir"
         */
        getData.userLoginData.put("admin0@ub.ac.id","default-login-pass");
        getData.userData.put("admin0@ub.ac.id",Arrays.asList("admin0@ub.ac.id","default-login-pass","0123456789","Admin UB","Admin","30","Laki-laki","Malang"));
        String userLogin = "";
        String userPassword = "";
        String userType = "";
        int menuChoose = 0;
        while (true)
        {
            /* Main login page */
            generatePage.defaultWelcomeHeader(getData.DEFAULT_SUB_HEADER);
            generatePage.body("Empty",4);
            generatePage.bodyWithContent(2,"1. Login",false);
            generatePage.bodyWithContent(2,"2. Register",false);
            generatePage.body("Empty",1);
            generatePage.bodyWithContent(2,"3. Keluar",false);
            try
            {
                menuChoose = Integer.parseInt(generatePage.bodyWithContent(2,"Pilihan anda",true));
            }
            catch (NumberFormatException e)
            {
                //
            }
            generatePage.body("Empty",1);
            generatePage.headerFooter();
            if
            (
                /* If input is valid */
                menuChoose == 1 ||
                menuChoose == 2
            )
            {
                /* Break out of loop then print main menu log in / register */
                boolean validUserLogin = true;
                for (String i : getData.userData.keySet())
                {
                    for (String j : getData.userData.get(i))
                    {
                        System.err.println(j);
                    }
                }
                if (menuChoose == 1)
                {
                    do
                    {
                        if (!validUserLogin)
                        {
                            /* Prompt user to re-enter login credentials */
                            System.out.println("\n" + "Data yang anda masukkan salah, silahkan input kembali");
                        }

                        /* Login page */
                        validUserLogin = false;
                        generatePage.defaultWelcomeHeader(getData.DEFAULT_SUB_HEADER);
                        generatePage.body("Empty",4);
                        userLogin = generatePage.bodyWithContent(2,"Masukkan email",true);
                        userPassword = generatePage.bodyWithContent(2,"Masukkan password",true);
                        generatePage.body("Empty",4);
                        generatePage.headerFooter();
                        if (getData.userLoginData.containsKey(userLogin) && getData.userLoginData.get(userLogin).equals(userPassword))
                        {
                            validUserLogin = true;
                            System.err.println("LOG SUCCESSFUL");
                        }
                    }
                    while (!validUserLogin);
                }
            }
        }
    }
}