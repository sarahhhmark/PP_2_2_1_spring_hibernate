package hiber.dao;

import hiber.model.Car;
import org.hibernate.SessionFactory;

import javax.persistence.TypedQuery;
import java.util.List;

public class CarDaoImp implements CarDao{
    private SessionFactory sessionFactory;

    @Override
    public void add(Car car) {
        sessionFactory.getCurrentSession().save(car);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Car> listCars() {
        TypedQuery<Car> query=sessionFactory.getCurrentSession().createQuery("from Car");
        return query.getResultList();
    }

}
