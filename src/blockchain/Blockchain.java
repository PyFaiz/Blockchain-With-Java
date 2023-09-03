package blockchain;
import java.util.ArrayList;
import com.google.gson.GsonBuilder;
    
public class Blockchain{

    public static ArrayList<Block> blockchain =  new ArrayList<Block>();
    public static void main(String[] args) {
        //Block genesisblock = new Block("First Block in blockchain", "0");
        //System.out.println("Hash for Block 1 : " + genesisblock.hash);
        blockchain.add(new Block("First Block in blockchain", "0"));
        blockchain.add(new Block("Hi, I am 2nd block in blockchain", blockchain.get(blockchain.size() - 1).hash));    
        //Block secondblock  = new Block("Hi, I'm 2nd block in blockchain", blockchain.get(blockchain.size() - 1).hash);
        //System.out.println("Hash for Block 2 : " + secondblock.hash);
        blockchain.add(new Block("Hi, I am 3rd block in blockchain",blockchain.get(blockchain.size() - 1).hash ));
        //Block thirdblock  = new Block("Hi, I'm 3rd block in blockchain", secondblock.hash);
        //System.out.println("Hash for Block 3 : " + thirdblock.hash);
        
        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println(blockchainJson);
    }
}