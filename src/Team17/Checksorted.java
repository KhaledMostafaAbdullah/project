package Team17;

import java.util.Random;

public class Checksorted {
    public boolean checksorted (int [] array)
    {
        boolean value = true;
        if (array != null && array.length > 0)
        {
            int pre_num = array[0];
            for (int i = 1; i < array.length; i++)
            {
                int stat = array[i];
                if (stat < pre_num)
                {
                    value = false;
                    break;
                }
                pre_num = stat;
            }
        }
        else
            value = false;
        return value;
    }
}
