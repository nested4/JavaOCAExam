package ch5.interfc.q063;

interface Exportable {
	void export(); 
}
class Tool implements Exportable {//line1
	public void export() {          
		System.out.println("Tool::export");
	}
}
class ReportTool extends Tool {
	void export() {                      // line n2
		//	        System.out.println("RTool::export");
	}
	public static void main(String[] args) {
		Tool aTool = new ReportTool();
		Tool bTool = new Tool();
		callExport(aTool);
		callExport(bTool);
	}
	public static void callExport(Exportable ex) {
		ex.export();
	}
}
public class Q063 {
}
/* What is the result?  (Same 51)
 A. Compilation fails only at line n2.			>>OK
 B. RTool:exportTool::export
 C. Tool::exportTool:export
 D. Compilation fails only at line n1.
 E. Compilation fails at both line n1 and line n2.

*/

/**  attention to overriding and assumption rule for a method
Rule 2. The method in the child class must be at least as accessible or more accessible than the method in the parent class.
TABLE 4.2 Access modifiers, p.180
 private (in class) < default (in package) < protected (in package or subclasses)< public  (any)

 Attention to assumptions for access and special modifiers: 
 1- for a class:         		public or default abstract keyword (assumed)  (Rule 4)
 2- for a nondefault method:    public abstract keywords (assumed)			  (Rule 5 )
 3- for a variable:  	 		public static final keywords (assumed)
*/


