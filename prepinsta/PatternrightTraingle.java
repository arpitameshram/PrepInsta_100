class PatternrightTraingle{
	public static void main(String args[]){
		int lines = 4;
		int star = 1;

		for(int r = 1; r <= lines; r++){
			for(int c = 1; c <= star; c++){
				System.out.print('*');
			}
		System.out.println();
		star++;
		}
	}
}