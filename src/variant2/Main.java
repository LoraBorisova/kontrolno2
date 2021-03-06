/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kostadinova
 */

package variant2;
public class Main{

    public static void main(String[] args) {
        Textbook maths = new Textbook("Mathematics", "Mathematicians seek and use patterns to formulate new conjectures;"
                + " they resolve the truth or falsity of conjectures by mathematical proof.", "1234567890");
        Textbook biology = new Textbook("Biology", "Biology is the natural science that studies life and living organisms, "
                + "including their physical structure and chemical processes.", "6789012345");
        Textbook geography = new Textbook("Geography", "Geography is often defined in terms of two branches: "
                + "human geography and physical geography.", "1357924680");


        // Task 1
        String isbn = "123456789";

        try {
            maths.setIsbn(isbn);
        }catch (IllegalISBN e){
            e.printStackTrace();
        }

        // Task 3
        String str = "ti";
        System.out.println(maths.maxContaingWordLength(str));

        PublishingOrder order1 = new PublishingOrder(1, maths, 10);
        PublishingOrder order2 = new PublishingOrder(2, biology, 8);
        PublishingOrder order3 = new PublishingOrder(3, geography, 7);

        Publisher publisher = new Publisher("McGraw-Hill");
        publisher.addOrder(order1);
        publisher.addOrder(order2);
        publisher.addOrder(order3);

        // Task 2
        String fileName = publisher.getName() + ".txt";
        System.out.println(fileName);
        publisher.writeOrderstoFile(fileName);

        // Task 4
        publisher.startPublishing();


    }

}
