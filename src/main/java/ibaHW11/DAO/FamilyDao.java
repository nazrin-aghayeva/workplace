package ibaHW11.DAO;

import java.util.List;
import java.util.Optional;

public interface FamilyDao<Family> {
    List<Family> getAll();
    Optional<Family> get(int id);
    boolean deleteById(int id);
    boolean deleteFamily(Family a);
    void save(Family a);
}
