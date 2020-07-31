
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu Jul 30 20:53:43 CST 2020
//----------------------------------------------------

package Backend;

import java.util.LinkedList;
import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu Jul 30 20:53:43 CST 2020
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\012\000\002\002\004\000\002\002\003\000\002\004" +
    "\004\000\002\004\003\000\002\003\004\000\002\003\003" +
    "\000\002\003\003\000\002\005\004\000\002\006\004\000" +
    "\002\006\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\015\000\006\003\004\004\007\001\002\000\010\002" +
    "\ufffb\004\ufffb\005\ufffb\001\002\000\004\002\017\001\002" +
    "\000\010\002\ufffe\004\013\005\011\001\002\000\010\002" +
    "\ufffc\004\ufffc\005\ufffc\001\002\000\004\002\000\001\002" +
    "\000\004\004\014\001\002\000\004\002\uffff\001\002\000" +
    "\010\002\ufffd\004\ufffd\005\ufffd\001\002\000\006\002\ufff8" +
    "\004\ufff8\001\002\000\006\002\ufffa\004\016\001\002\000" +
    "\006\002\ufff9\004\ufff9\001\002\000\004\002\001\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\015\000\010\002\004\003\005\004\007\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\005\011\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\006\014\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public static String resultado= "";
    LinkedList tablaErroresSintacticos =  new LinkedList();
    public void syntax_error(Symbol s){
        String lexema = s.value.toString();
        int fila =  s.right;
        int columna = s.left;
        String red="\033[31m"; 
        System.out.println(red + "ERROR SINTACTICO RECUPERADO!! \t\tLexema: " + lexema+ "\t\tFila " + fila +"\t\tColumna: " +columna+"simbolo"  );
        ErrorS error = new ErrorS(lexema, fila, columna , "error Sintactico");
        tablaErroresSintacticos.add(error);
    }

    public void unrrecovered_syntax_error(Symbol s) throws java.lang.Exception {
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;
        String red="\033[31m"; 
        System.out.println(red + "ERROR SINTACTICO SIN RECUPERACION!! \t\tLexema: " + lexema+ "\t\tFila " + fila +"\t\tColumna: " +columna );
        ErrorS error = new ErrorS(lexema, fila, columna , "error Sintactico");
        tablaErroresSintacticos.add(error);
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // D ::= DIGITO 
            {
              Object RESULT =null;
		int digitoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int digitoright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object digito = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    Simbolo symb= new Simbolo(Integer.parseInt(digito.toString())*0.5, 0.5/2);
                    RESULT= symb;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("D",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // D ::= D DIGITO 
            {
              Object RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Simbolo d = (Simbolo)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int digitoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int digitoright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object digito = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		Simbolo symb= new Simbolo(d.getValor()+ Integer.parseInt(digito.toString())*(d.getMultiplicador()), d.multiplicador/2);
                RESULT= symb;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("D",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // R ::= PUNTO D 
            {
              Object RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Simbolo d = (Simbolo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		             
                String resul= String.valueOf(d.getValor());          
                 System.out.println("PUNTO ........."+ resul);
                RESULT = resul;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("R",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // E ::= error 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // E ::= DIGITO 
            {
              Object RESULT =null;
		int digitoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int digitoright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object digito = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    RESULT= (int)Integer.parseInt(digito.toString());
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // E ::= E DIGITO 
            {
              Object RESULT =null;
		int res1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int res1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object res1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int digitoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int digitoright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object digito = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                    RESULT=  Integer.parseInt(digito.toString()) + (Integer.parseInt(res1.toString())*2); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // N ::= E 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    String decimal= String.valueOf(e.toString());
                    RESULT =  decimal;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("N",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // N ::= E R 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
                    String decimal1 = d.toString();
                    String decimal= String.valueOf(e.toString()+"." +decimal1.substring(decimal1.indexOf('.') + 1));
                    System.out.println(".......NNNN"+ decimal);
                    RESULT =  decimal;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("N",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // S ::= N 
            {
              Object RESULT =null;
		int res0left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int res0right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object res0 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    parser.resultado = res0.toString();  
                    RESULT = res0.toString(); 
                    System.out.println( "Resultado" + res0.toString());
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= S EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

