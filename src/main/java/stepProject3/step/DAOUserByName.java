package stepProject3.step;

import lesson18s4recap.dao.DAO;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

public class DAOUserByName implements DAO<UserByName> {
  @Override
  public Collection<UserByName> getAll() {
    throw new RuntimeException("isn't supported");
  }

  @Override
  public Collection<UserByName> getAllBy(Predicate<UserByName> p) {
    /**
     * pass your data through predicate
     */
    return null;
  }

  @Override
  public Optional<UserByName> get(int id) {
    throw new RuntimeException("isn't supported");
  }

  @Override
  public void create(UserByName data) {
    throw new RuntimeException("isn't supported");
  }

  @Override
  public void delete(int id) {
    throw new RuntimeException("isn't supported");
  }

  @Override
  public void deleteBy(Predicate<UserByName> p) {
    throw new RuntimeException("isn't supported");
  }
}
