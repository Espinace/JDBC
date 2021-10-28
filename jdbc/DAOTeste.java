package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?)";
		System.out.println(dao.incluir(sql, "Bruno", 1000));
		System.out.println(dao.incluir(sql, "Joao", 1001));
		System.out.println(dao.incluir(sql, "Miriam", 1002));

		dao.close();
	}
}
