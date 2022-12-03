package turing;

public class Tape {
	// current cell
	Cell curCellObj;
	
	public Tape() {
		// Constructor to create a blank tape 
		Cell cellObj=new Cell();
		cellObj.content=' ';
		cellObj.next=null;
		cellObj.prev=null;
		curCellObj=cellObj;
	}
	
	public Cell getCurrentCell() {
		// returns the pointer that points to the current cell.
		return curCellObj;
	}
	
	public char getContent() {
		// returns the char from the current cell.
		return curCellObj.content;
	}
	
	public void setContent(char ch) {
		// changes the char in the current cell to the specified value.
		curCellObj.content = ch;
	}
	
	public void moveLeft() {
		// moves the current cell one position to the left along the tape.
		if(curCellObj.prev==null) {
			// Create a cell that is blank on the left and the current cell on the right.
			Cell newCell = new Cell();
			newCell.content = ' ';
			newCell.next=curCellObj;
			newCell.prev=null;
			// Link the cell created to the left of the current cell
			curCellObj.prev=newCell;
		}
		// Move the current cell
		curCellObj=curCellObj.prev;
	}
	
	public void moveRight() {
		// moves the current cell one position to the right along the tape.
		if(curCellObj.next==null) {
			// Create a cell that is blank on the right and the current cell on the left.
			Cell newCell = new Cell();
			newCell.content = ' ';
			newCell.next=null;
			newCell.prev=curCellObj;
			// Link the cell created to the right of the current cell
			curCellObj.next=newCell;
		}
		curCellObj=curCellObj.next;
	}
	
	public String getTapeContents() {
		// returns a String consisting of the chars from all the cells on the tape,
		//read from left to right, except that leading or trailing blank characters should be discarded.
		Cell cellPoint = curCellObj;
		String cellContent = "";
		// Move to the leftmost point.
		while(cellPoint.prev!=null) {
			cellPoint = cellPoint.prev;
		}
		// Create a string, moving to the far right.
		while(cellPoint.next!=null) {
			cellContent+=cellPoint.content;
			cellPoint=cellPoint.next;
		}
		return cellContent;
	}
	
}
