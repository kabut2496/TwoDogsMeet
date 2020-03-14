package dogtester;

import static dogtester.Dog.caringForYourDog;
import javax.swing.*;
public class DogTester {

    public static void main(String[] args) {
        

        String name1,name2,breed1,breed2,outPut,hunger1,hunger2,change,Aggression,again ;   
        int nHunger,nAggression,x;
        x=0;
           
        do{
        System.out.println("two dogs will be created");
        name1 = JOptionPane.showInputDialog("Name of the first dog");
        name2 = JOptionPane.showInputDialog("Name of the second dog");
        breed1 = JOptionPane.showInputDialog("breed of the first dog");
        breed2 = JOptionPane.showInputDialog("breed of the second dog");
        
        Dog dog1 = new Dog(name1, breed1, 8, 4);
        Dog dog2 = new Dog(name2, breed2);
        

        //Print the details of each dog
        System.out.println(dog1.toString());
        System.out.println("--------------------------");

        System.out.println(dog2.toString());
        System.out.println("--------------------------");

       
        change = JOptionPane.showInputDialog("would you like to change the values of the hunger and agrression of the first dog");
        change.toLowerCase();
        
        if(change.equals("yes")){
        hunger1 = JOptionPane.showInputDialog("input the dogs new hunger value");
        nHunger=Integer.parseInt(hunger1);
        dog2.setHunger(nHunger);

        
        Aggression = JOptionPane.showInputDialog("input the dogs new agression values");
        nAggression=Integer.parseInt(Aggression);   
        dog1.setAggression(nAggression);
        }
        
        change = JOptionPane.showInputDialog("would you like to change the values of the hunger and agrression of the second dog");
        change.toLowerCase();
        

        
        if(change.equals("yes")){
        hunger1 = JOptionPane.showInputDialog("input the dogs new hunger value");
        nHunger=Integer.parseInt(hunger1);
        dog2.setHunger(nHunger);
        
        Aggression = JOptionPane.showInputDialog("input the dogs new agression values");
        nAggression=Integer.parseInt(Aggression);   
        dog2.setAggression(nAggression);
        
        }
        
        
        System.out.println("your dogs values are");
        System.out.println("--------------------------");
        
        System.out.println(dog1.toString());
        System.out.println("--------------------------");

        System.out.println(dog2.toString());
        System.out.println("--------------------------");

        if(dog1.getAggression()>5 ||dog2.getAggression()>5 ){
            System.out.println("the dogs will have a unfrendly meeting because they have two much aggression");
        }
        
        if(dog1.getHunger()<5 ||dog2.getHunger()<5 ){
            System.out.println("the dogs will have a unfrendly meeting because they are two hungry");
        }
    again = JOptionPane.showInputDialog("would you like to creat two new dogs?");
    again.toLowerCase();
    if(again.equals("no")){
        x++;
    }
        }while(x==0);
    }
    private static int setAggression() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
