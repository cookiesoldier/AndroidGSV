package server;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import shared.DALException;
import shared.UserDTO;

public class MySQLLoginDAO {

	public MySQLLoginDAO() {
		try {
			new Connector();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public UserDTO getUser() throws DALException {
		ResultSet rs = Connector.doQuery("");
		try {
			if (!rs.first())
				throw new DALException("Brugeren findes ikke");
			return new UserDTO();
		} catch (SQLException e) {
			throw new DALException(e.getMessage());
		}
	}

	public void createUser(UserDTO user) throws DALException {
		Connector.doUpdate("");
	}

	public void updateUser(UserDTO user) throws DALException {

	}

	public List<UserDTO> getUserList() throws DALException {
		List<UserDTO> list = new ArrayList<UserDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM operatoer");
		try {
			while (rs.next()) {
				list.add(new UserDTO());
			}
		} catch (SQLException e) {
			throw new DALException(e.getMessage());
		}
		return list;
	}

	public void deleteUser(UserDTO user) throws DALException{
		Connector.doUpdate("");
	}
}
