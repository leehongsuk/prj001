package first.sample.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO
{

    public List<Map<String, Object>> selectBoardList(Map<String, Object> map)
    {
        return (List<Map<String, Object>>)selectList("sample.selectBoardList", map);
    }

}
