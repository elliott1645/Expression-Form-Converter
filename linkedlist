class Link {
	
    public String equ;
    public Link nextLink;

    //Link constructor
    public Link(String equ) {
	    this.equ = equ; 
    }

    //Print Link data
    public void printLink() {
	    System.out.print(""+ equ +" ");
    }
}

class LinkList {
    private Link first;

    //LinkList constructor
    public LinkList() {
	    first = null;
    }

    //Returns true if list is empty
    public boolean isEmpty() {
	    return first == null;
    }

    //Inserts a new Link at the first of the list
    public void insert(String equ) {
	    Link link = new Link(equ);
	    link.nextLink = first;
	    first = link;
    }

    //Deletes the link at the first of the list
    public Link delete() {
	    Link temp = first;
	    first = first.nextLink;
	    return temp;
    }

    //Prints list data
    public void printList() {
	    Link currentLink = first;
	    System.out.print("List: ");
	    while(currentLink != null) {
		    currentLink.printLink();
		    currentLink = currentLink.nextLink;
	    }
	    System.out.println("");
	    
    }
}  



