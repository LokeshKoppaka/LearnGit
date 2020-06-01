
public class Test extends TieTacToe{
	public void tesThis() {
		System.out.println("This is test - second commit");
	}
	public void  addTokenToBoard(char token, int row, int col) {
		System.out.println("Test method");
	}
	public static void main(String args[]) {
		TieTacToe t = new TieTacToe();
		t.addTokenToBoard('e', 1, 2);
		}
}
