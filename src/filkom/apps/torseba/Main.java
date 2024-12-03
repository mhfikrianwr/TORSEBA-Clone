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
                else if (menuChoose == 2)
                {
                    /* Register page */
                    boolean isRegistered = true;
                    String tempUserEmailRegister = "";
                    String tempUserPasswordRegister = "";
                    String tempUserFullName = "";
                    String tempUserAddress = "";
                    String tempUserPhoneNumber = "";
                    String tempUserGender = "";
                    String tempPlaceDateOfBirth = "";
                    int counter = 0;
                    do
                    {
                        /* Prompt user to enter another email if already registered */
                        if (!(isRegistered))
                        {
                            System.out.println("Email sudah digunakan, silahkan gunakan email lain");
                        }

                        /* Update value to false (will be true when no duplicate found in registered user list) */
                        isRegistered = false;

                        /* Prints default header */
                        generatePage.defaultWelcomeHeader(getData.DEFAULT_SUB_HEADER);
                        generatePage.body("Empty",6);
                        tempUserEmailRegister = generatePage.bodyWithContent(2,"Masukkan email",true);
                        tempUserPasswordRegister = generatePage.bodyWithContent(2,"Masukkan password",true);
                        generatePage.body("Empty",4);
                        generatePage.headerFooter();

                        /* Check if entered email already registered */ 
                        isRegistered = !(getData.userLoginData.containsKey(tempUserEmailRegister));
                    }
                    while (!(isRegistered));

                    /* Store values to registered users */
                    // getData.validUser[getData.currentRegisteredUser] = (tempUserEmailRegister + " " + tempUserPasswordRegister + " " + "User").split("\s");
                    // userLogin = tempUserEmailRegister;
                    // boolean confirmUserDataInput = false;
                    // while (!confirmUserDataInput)
                    // {
                    //     generatePage.defaultWelcomeHeader(getData.DEFAULT_SUB_HEADER);
                    //     generatePage.body("Empty",2);
                    //     generatePage.bodyWithContent(2,"Masukkan data anda",false);
                    //     tempUserFullName = generatePage.bodyWithContent(2,"Nama lengkap",true);
                    //     tempUserAddress = generatePage.bodyWithContent(2,"Alamat lengkap",true);
                    //     tempUserPhoneNumber = generatePage.bodyWithContent(2,"Nomor telepon",true);
                    //     tempUserGender = generatePage.bodyWithContent(2,"Masukkan jenis kelamin",true);
                    //     tempPlaceDateOfBirth = generatePage.bodyWithContent(2,"Masukkan tempat tanggal lahir",true);
                    //     generatePage.body("Empty",3);
                    //     generatePage.headerFooter();
                    //     generatePage.defaultWelcomeHeader(getData.DEFAULT_SUB_HEADER);
                    //     generatePage.body("Empty",2);
                    //     generatePage.bodyWithContent(2,"Konfirmasi data",false);
                    //     generatePage.bodyWithContent(2,"Nama : " + tempUserFullName,false);
                    //     generatePage.bodyWithContent(2,"Alamat : "  + tempUserAddress,false);
                    //     generatePage.bodyWithContent(2,"Nomor telepon : " + tempUserPhoneNumber,false);
                    //     generatePage.bodyWithContent(2,"Jenis kelamin : " + tempUserGender,false);
                    //     generatePage.bodyWithContent(2,"Tempat, tanggal lahir : " + tempPlaceDateOfBirth,false);
                    //     generatePage.body("Empty",2);
                    //     String temp = generatePage.bodyWithContent(2,"Konfirmasi data? (Enter / 1 (ubah data))",true);
                    //     generatePage.body("Empty",2);
                    //     generatePage.headerFooter();

                    //     /* Will default to true (data confirmed as valid by user) and should proceed to next step */
                    //     confirmUserDataInput = !temp.equalsIgnoreCase("1");
                    // }

                    // /* When valid, insert to getData.userData */
                    // userData[getData.currentRegisteredUser].setEmail(tempUserEmailRegister);
                    // userData[getData.currentRegisteredUser].setPassword(tempUserPasswordRegister);
                    // userData[getData.currentRegisteredUser].setFullName(tempUserFullName);
                    // userData[getData.currentRegisteredUser].setAddress(tempUserAddress);
                    // userData[getData.currentRegisteredUser].setTelephoneNumber(tempUserPhoneNumber);
                    // userData[getData.currentRegisteredUser].setGender(tempUserGender);
                    // userData[getData.currentRegisteredUser].setPlaceDateBirth(tempPlaceDateOfBirth);
                    // getData.currentRegisteredUser++; /* Increment amount of registered users */
                    // userType = "User"; /* Update userType (current) as user to redirect user to booking / rent page */
                }
            }
        }
    }
}