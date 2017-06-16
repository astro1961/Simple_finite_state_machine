import java.util.Random;

/**
 * Created by astro1961 on 16.06.2017.
 */
public class Machine {
   // В эотм классе программа должна принять входные данные и дать реакцию на выходе
public Machine(){

}
public int random(){
    Random r = new Random();
    return r.nextInt(6)+1;
}
public boolean theTest(int a){
    if(random() == a)    return true;
    else return false;
}
}
