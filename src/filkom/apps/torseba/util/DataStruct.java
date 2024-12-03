package filkom.apps.torseba.util;

/**
 * <h1>Default Data Values</h1>
 * 
 * @author Syafa Hadyan Rasendriya
 */
public class DataStruct
{
    final String DEFAULT_HEADER = "Selamat Datang"; /* Default header */
    final String DEFAULT_SUB_HEADER = "Filkom Tour & Travel"; /* Default sub header */
    final String DEFAULT_CURRENCY = "Rp"; /* Default currency */
    final int BOX_WIDTH = 200; /* Width of the box */
    final int MAX_DATA_AMOUNT = 100; /* Max data amount */
    int currentRegisteredUser = 0; /* Amount of registered users */
    int currentRegisteredCar = 0; /* Amount of registered car */
    double income = 0; /* Default income to 0, will update when app user books a trip */
    boolean exitWeb = false; /* Exit app when true */
    String[][] validUser = new String[MAX_DATA_AMOUNT][]; /* Registered users (All roles) */
    String[] tableHeaderData = /* Table header for displaying user / driver data */
    {
        "Email",
        "Password",
        "Nama",
        "Alamat",
        "Telepon",
        "Jenis Kelamin",
        "Tempat, tanggal lahir"
    };
    String[][] oneWayDestinationTable = /* One way destination with price list */
    {
        {"Surabaya", "Malang", "100000"},
        {"Madura", "Malang", "200000"},
        {"Banyuwangi", "Malang", "250000"},
        {"Situbondo", "Malang", "175000"},
        {"Tulungagung", "Malang", "125000"}
    };
    String[] tableHeaderCarData = /* Table header for car data */
    {
        "Nomor Plat",
        "Merk Mobil",
        "Kategori Mobil",
        "Warna Mobil",
        "Tahun Keluaran Mobil",
        "Nomor Mesin",
        "Nomor Rankga"
    };
    String[] tableHeaderRentCar = /* Table header for car rent */
    {
        "Jam",
        "Tarif",
        "Tambahan"
    };
    int[][] rentCarTable = /* Car rent table */
    {
        {5,400000,100000},
        {5,500000,150000}
    };
    public int getValueBoxWidth()
    {
        return this.BOX_WIDTH;
    }
    public String getDefaultHeader()
    {
        return this.DEFAULT_HEADER;
    }
}