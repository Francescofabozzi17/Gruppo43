package implementazioneDao;

import java.sql.Connection;

public class SedutadilaureaPostgresDao {
    private final Connection connection;

    public SedutadilaureaPostgresDao(Connection connection) {
        this.connection = connection;
    }
}
