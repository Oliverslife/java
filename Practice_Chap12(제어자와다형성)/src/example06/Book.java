package example06;

public class Book extends Product {
	
	private int ISBN;
	private String title;
	private String author;
	
	public Book(int productID, String description, String maker, int price, int iSBN, String title, String authoer) {
		super(productID, description, maker, price);
		ISBN = iSBN;
		this.title = title;
		this.author = authoer;
	}

	public int getISBN() {
		return ISBN;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();	//����Ŭ������ �޼��带 ����� ȣ��
		System.out.println("����ǥ�ص�����ȣ >> " + this.getISBN());
		System.out.println("å ���� >> " + this.getTitle());
		System.out.println("���� >> " + this.getAuthor());		
	}
	

}
