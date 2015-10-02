package first.sample.controller;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import first.sample.service.SampleService;

@Controller
public class SampleController
{
    //@Resource(name = "sampleService")
    //private SampleService sampleService;

    @RequestMapping(value = "/openSampleBoardList.do")
    public ModelAndView openSampleBoardList(Map<String, Object> map) throws Exception
    {
        ModelAndView mv = new ModelAndView("boardList");

        //List<Map<String, Object>> list = sampleService.selectBoardList(map);
        //mv.addObject("list", list);

        return mv;
    }
}