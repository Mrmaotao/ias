package cn.tit.ias.service;


public interface IBaseCRUDService {
    public boolean addObject(Object entity);
    public boolean updateObject(Object entity);
    public Object getObject(String condition);
    
}
