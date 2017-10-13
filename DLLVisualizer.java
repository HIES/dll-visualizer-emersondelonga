import bridges.connect.Bridges;
import bridges.connect.Bridges;
import bridges.base.DLelement;
/**
 * A class that utilizes the BRIDGES library to visualize a doubly-linked list.
 *
 * @author (your name)
 */
public class DLLVisualizer
{
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{

        // DONE: Define credentials
        final String API_KEY = "1175270563901";
        final String USER_ID = "emersondelonga";
        
        // No need to modify Bridges constructor
        Bridges bridge = new Bridges(1, API_KEY, USER_ID);

        // TO DO: Build the objects to be added to your DLL
        Track t1 = new Track("All Star","Smash Mouth");
        Track t2 = new Track("We Are Number One","Robbie Rotten");
        Track t3 = new Track("Never Gonna Give You Up","Rick Astley");
        Track t4 = new Track("iCarly Theme","Miranda Cosgrove");
        Track t5 = new Track("Never Gonna Give You Up","Rick Astley");
         
        // TO DO: Build the head 
        DLelement head = new DLelement(t1.toString(),t1);

        
        // TO DO: Create the rest of the Nodes/DLelements and link them to form a DLL
        DLelement second = new DLelement(t2.toString(),t2);
        DLelement third = new DLelement(t3.toString(),t3);
        DLelement fourth = new DLelement(t4.toString(),t4);
        DLelement fifth = new DLelement(t5.toString(),t5);
        
        head.setNext(second);
        second.setNext(third);
        second.setPrev(head);
        third.setNext(fourth);
        third.setPrev(second);
        fourth.setNext(fifth);
        fourth.setPrev(third);
        fifth.setPrev(fourth);
        
        //Prepare for visualization
        bridge.setDataStructure(head);
        bridge.setTitle("A Doubly-Linked List");
        bridge.visualize();
    }
}
