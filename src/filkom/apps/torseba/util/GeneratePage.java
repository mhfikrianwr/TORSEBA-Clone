package filkom.apps.torseba.util;
import java.util.*;

/**
 * <h1>Generate Page</h1>
 * 
 * @author Syafa Hadyan Rasendriya
 */
public class GeneratePage
{
    static Scanner input = new Scanner(System.in);
    static DataStruct getData = new DataStruct();
    public void defaultWelcomeHeader(String content)
    {
        /* Calculate to print at middle */
        int spaceBefore = (getData.BOX_WIDTH - content.length()) / 2;
        int headerSpaceBefore = (getData.BOX_WIDTH - getData.DEFAULT_HEADER.length()) / 2;

        /* Default welcome header to avoid redundancy */
        headerFooter();
        body("Empty",1);
        bodyWithContent(headerSpaceBefore,getData.DEFAULT_HEADER,false);

        /* Display as requested */
        bodyWithContent(spaceBefore,content,false);
        body("Empty",1);
        body("Divider",1);
    }
    public void defaultFalseInput()
    {
        /* Default print when input is not valid (will be used everywhere) */
        System.out.println("\n" + "Input yang anda masukkan salah, silahkan masukkan input kembali");
    }
    public void headerFooter()
    {
        /* Print header and footer */
        System.out.print('+');
        for (int i = 0; i < getData.BOX_WIDTH; i++)
        {
            System.out.print('-');
        }
        System.out.println('+');
    }
    public void body(String option, int height)
    {
        /* Print box from left to right. Accepts any height (min 1), if empty or < 1, won't print any */

        /* Determine which spacing is required (must explicitly stated) otherwise will default to space */
        char space = option.equalsIgnoreCase("Divider") ? '-' : ' ';
        for (int i = 0; i < height; i++)
        {
            System.out.print('|');
            for (int j = 0; j < getData.BOX_WIDTH; j++)
            {
                System.out.print(space);
            }
            System.out.println('|');
        }
    }
    public String bodyWithContent(int spaceBefore, String content, boolean takeInput)
    {
        /* Prints box with content (must be a String) and must explicitly state input with boolean values */
        System.out.print('|');
        String inputValue = "";
        int spaceAfter = getData.BOX_WIDTH - spaceBefore - content.length(); /* Calculate width after content */

        /* Add spacing before content is printed */
        for (int i = 0; i < spaceBefore; i++)
        {
            System.out.print(' ');
        }
        System.out.print(content);

        /* If take input, will store to inputValue then return value */
        if (takeInput)
        {
            System.out.print(" : ");
            inputValue = input.nextLine();
        }

        /* If explicitly stated that no input should be taken from app user, then print the rest of the spacing */
        else
        {
            for (int i = 0; i < spaceAfter; i++)
            {
                System.out.print(' ');
            }
            System.out.println('|');
        }

        /* Will return empty string when takeInput equals to false and will do just fine if not stored in any var */
        return inputValue;
    }
}