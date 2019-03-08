package com.chen.medicine_mall.service.imp;

import com.chen.medicine_mall.mapper.MedicineMapper;
import com.chen.medicine_mall.pojo.Medicine;
import com.chen.medicine_mall.pojo.MedicineExample;
import com.chen.medicine_mall.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName MedicineServiceImpl
 * @Description TODO
 * @Author chen
 * @Data 2018/12/22 12:57
 * @Version 1.0
 **/
@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineMapper medicineMapper;

    @Override
    public List<Medicine> selectByMedicine(Medicine record) {
        MedicineExample example = new MedicineExample();
        MedicineExample.Criteria criteria = example.createCriteria();
        if(record.getMno() != null){
            criteria.andMnoLike("%"+record.getMno()+"%");
        }
        if(record.getMname() != null){
            criteria.andMnameLike("%"+record.getMname()+"%");
        }
        if(record.getMmode() != null){
            criteria.andMmodeLike("%"+record.getMmode()+"%");
        }
        if(record.getMefficacy() != null){
            criteria.andMefficacyLike("%"+record.getMefficacy()+"%");
        }
        return medicineMapper.selectByExample(example);
    }

    @Override
    public Medicine selectByMno(String mno) {
        return medicineMapper.selectByPrimaryKey(mno);
    }

    @Override
    public Medicine selectByMname(String mname) {
        return medicineMapper.selectByMname(mname);
    }

    @Override
    public List<Medicine> selectByExample(Medicine record) {
        MedicineExample example = new MedicineExample();
        MedicineExample.Criteria criteria = example.createCriteria();
        if(record.getMno() != null && record.getMno() !=""){
            criteria.andMnoEqualTo(record.getMno());
        }
        if(record.getMname() != null && record.getMname() != ""){
            criteria.andMnameEqualTo(record.getMname());
        }
        if(record.getMmode() != null && record.getMmode() != ""){
            criteria.andMmodeEqualTo(record.getMmode());
        }
        if(record.getMefficacy() != null && record.getMefficacy() != ""){
            criteria.andMefficacyEqualTo(record.getMefficacy());
        }
//        MedicineMapper.selectByExample(example).forEach(i -> System.out.println(i.toString()));
        return medicineMapper.selectByExample(example);
    }

    @Override
    public int deleteByMno(String mno) {
        return medicineMapper.deleteByPrimaryKey(mno);
    }

    @Override
    public void batchDeletes(List<String> list) {
        medicineMapper.batchDeletes(list);
    }

    @Override
    public boolean updateByPrimaryKey(Medicine medicine) {
        return medicineMapper.updateByPrimaryKey(medicine) > 0 ? true: false;
    }

    @Override
    public List<Medicine> selectLikeByExample(Medicine record) {
        MedicineExample example = new MedicineExample();
        MedicineExample.Criteria criteria = example.createCriteria();
        if(record.getMno() != null){
            criteria.andMnoLike("%"+record.getMno()+"%");
        }
        if(record.getMname() != null){
            criteria.andMnameLike("%"+record.getMname()+"%");
        }
        if(record.getMmode() != null){
            criteria.andMmodeLike("%"+record.getMmode()+"%");
        }
        if(record.getMefficacy() != null){
            criteria.andMefficacyLike("%"+record.getMefficacy()+"%");
        }
//        MedicineMapper.selectByExample(example).forEach(i -> System.out.println(i.toString()));
        return medicineMapper.selectByExample(example);
    }

    @Override
    public boolean insert(Medicine medicine) {
        return medicineMapper.insert(medicine) > 0? true: false;
    }
}
