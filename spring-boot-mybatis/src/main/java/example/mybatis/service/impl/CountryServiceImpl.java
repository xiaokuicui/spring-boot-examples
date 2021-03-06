package example.mybatis.service.impl;

import com.github.pagehelper.PageHelper;
import example.mybatis.domain.Country;
import example.mybatis.mapper.CountryMapper;
import example.mybatis.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaokui
 * @Description:
 * @date 2018-04-03 17:57
 */
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryMapper countryMapper;

    @Override
    public List<Country> getAll(Country country) {
        if (country.getPageIndex() != null && country.getPageSize() != null) {
            PageHelper.startPage(country.getPageIndex(), country.getPageSize());
        }
        return countryMapper.selectAll();
    }

    @Override
    public Country getById(Long id) {
        return countryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteById(Long id) {
         countryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void save(Country country) {
        if(country.getId() != null){
            countryMapper.updateByPrimaryKey(country);
        }else {
            countryMapper.insert(country);
        }
    }
}
