package sg.edu.nus.iss.app.workshop16.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.app.workshop16.model.Mastermind;

@Service
public class BoardGameService {
    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    public int saveGame(final Mastermind mds) {
        redisTemplate.opsForValue().set(mds.getId(), mds);
        Mastermind result = (Mastermind) redisTemplate.opsForValue().get(mds.getId());
        System.out.println("  RESULT >>> " + result);
        if (result != null)
            return 1;
        return 0;
    }

    public Mastermind findById(final String msid) {
        return (Mastermind) redisTemplate.opsForValue().get(msid);
    }

}
