
public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Mysql에서 DB를 검색");

	}

	@Override
	public void insert() {
		System.out.println("Mysql에서 DB를 삽입");

	}

	@Override
	public void update() {
		System.out.println("Mysql에서 DB를 수정");

	}

	@Override
	public void delete() {
		System.out.println("Mysql에서 DB를 삭제");

	}

}
