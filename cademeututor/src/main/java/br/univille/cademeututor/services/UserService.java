package br.univille.cademeututor.services;

import org.springframework.stereotype.Service;

import br.univille.cademeututor.modelVO.UserVO;

@Service
public interface UserService {
    
    public void createUser(UserVO userVO);
}
