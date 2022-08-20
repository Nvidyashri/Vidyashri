class PolistationRunner{
	
	public static void main(String[] args){
		
		String[] kaidi={"sushma","deepthi","divya","vidya"};
		Polistation polistation=new Polistation(kaidi);
		polistation.setNoOfStaffs(12);
        polistation.inspectorName="vvvv";
        polistation.print();
	}
}