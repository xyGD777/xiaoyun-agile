package test.first_practice;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* PawnTest Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮһ�� 15, 2019</pre> 
* @version 1.0 
*/ 
public class PawnTest extends junit.framework.TestCase{
    public void testCreate(){
        String pawnColor = "white";
        Pawn pawn = new Pawn(pawnColor);
        assertEquals(pawnColor, pawn.getPawn());

        String pawnColor2 = "black";
        Pawn pawn2 = new Pawn(pawnColor2);
        assertEquals(pawnColor2, pawn2.getPawn());
    }



} 
