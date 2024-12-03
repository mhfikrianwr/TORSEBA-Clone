package filkom.apps.torseba.util;
import java.util.*;

/**
 * <h1>Default Data Values</h1>
 * 
 * @author Syafa Hadyan Rasendriya
 */
public class DataStruct
{
    public final int BOX_WIDTH = 200; /* Width of the box */
    public final int MAX_DATA_AMOUNT = 100; /* Max data amount */
    public final String DEFAULT_HEADER = "Selamat Datang"; /* Default header */
    public final String DEFAULT_SUB_HEADER = "Filkom Tour & Travel"; /* Default sub header */
    public final String DEFAULT_CURRENCY = "Rp"; /* Default currency */
    public HashMap<String,String> userLoginData = new HashMap<>(); /* Email and password  */
    public HashMap<List<String>,List<String>> userData = new HashMap<>(); /* All user data */
    public String[] tableHeaderData = /* Table header for displaying user / driver data */
    {
        "Email",
        "Password",
        "Role",
        "Nama",
        "Alamat",
        "Telepon",
        "Jenis Kelamin",
        "Tempat, tanggal lahir"
    };
}