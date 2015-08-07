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

	public UserDTO getUser(String email) throws DALException {
		ResultSet rs = Connector.doQuery("");
		try {
			if (!rs.first()) throw new DALException("Brugeren "+email+" findes ikke");
			return new UserDTO(rs.getString("email"),rs.getString("passwd"),rs.getInt("activated"));
		} catch (SQLException e) {
			throw new DALException(e.getMessage());
		}
	}

	public void createUser(UserDTO user) throws DALException {
		Connector.doUpdate("INSERT INTO user(email, passwd, activated) VALUES " +
						"(" + user.getEmail() + ", '" + user.getPasswd() + "', '" + user.getActivated() );
	}

	public void updateUser(UserDTO user) throws DALException {
		Connector.doUpdate(
				"UPDATE user SET  email = '" + user.getEmail() + "', passwd =  '" + user.getPasswd() + 
				"', activated = '" + user.getActivated()
				);
	}

	public List<UserDTO> getUserList() throws DALException {
		List<UserDTO> list = new ArrayList<UserDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM user");
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
		Connector.doUpdate("DELETE FROM user WHERE email ="+ user.getEmail());
	}
	public UserDTO loginCheck() throws DALException{
		UserDTO user = null;
		
		return user;
	}
}
