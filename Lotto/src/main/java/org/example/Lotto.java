package org.example;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;
import java.util.Objects;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers){
        validate(numbers);
        duplicated(numbers);
        rangeNumbers(numbers);
        this.numbers = numbers;
    }

    public void validate(List<Integer> numbers){
        if(numbers.size() != 6){
            throw new IllegalArgumentException("6개의 숫자가 아닙니다");
        }
    }

    public void duplicated(List<Integer> numbers){
        for(int i =0; i<numbers.size()-1; i++){
            if(Objects.equals(numbers.get(i), numbers.get(i + 1))){
                throw new IllegalArgumentException("6개의 숫자 중 중복된 숫자가 있습니다");
            }
        }
    }

    public void rangeNumbers(List<Integer> numbers){
        for(int i = 0; i<numbers.size(); i++){
            if(numbers.get(i) <= 0 || numbers.get(i) > 45){
                throw new IllegalArgumentException("숫자의 범위가 0~45의 범위를 넘어섰습니다");
            }
        }
    }

}