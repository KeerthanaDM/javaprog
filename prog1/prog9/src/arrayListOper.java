import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class arrayListOper {
    private ArrayList<String> colors;

    public arrayListOper() {
        this.colors = new ArrayList<>();
    }

    public void addEle(String ele)
    {
        colors.add(ele);
    }

    public String[] copyToArray()
    {
        String arr[]=new String[colors.size()];
        colors.toArray(arr);
        return arr;
    }

    public ArrayList<String> reverse()
    {
        ArrayList<String> rev=new ArrayList<>(colors);
        Collections.reverse(rev);
        return rev;
    }

    public ArrayList<String> sort()
    {
        ArrayList<String> rev=new ArrayList<>(colors);
        Collections.sort(rev);
        return rev;
    }

    public List sublist(int st,int en)
    {
        return colors.subList(st,en);
    }

    public ArrayList<String> getClone()
    {
        return (ArrayList<String>) colors.clone( );
    }

}
