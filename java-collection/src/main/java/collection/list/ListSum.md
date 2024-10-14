# [JAVA] 리스트의 합 구하기

자바에서는 리스트의 합을 구하는 여러 가지 방법이 있습니다. 전통적인 for 문, 향상된 for 문, 스트림 API, 재귀 호출, 그리고 병렬 스트림을 사용하는 방법이 있습니다.

## 1. 전통적인 for 문를 사용한 합 구하기

전통적인 for 문를 사용하여 리스트의 합을 구하는 방법은 직관적이고 간단합니다.

다음은 전통적인 for 문를 사용한 방법입니다:

```java
package util.list;

import java.util.List;

public class ListSum {

    /**
     * 리스트의 합을 전통적인 for 문를 사용
     *
     * @param list 합을 구할 리스트
     * @return 리스트 요소들의 합
     */
    public int sumUsingForLoop(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
```

### **장점:**
- **직관적:** 이해하기 쉬운 간단한 방법입니다.

### **단점:**
- **코드 길이:** 다른 방법들에 비해 코드가 길어질 수 있습니다.

## 2. 향상된 for 문를 사용한 합 구하기

향상된 for 문를 사용하면 코드가 더 간결해집니다.

다음은 향상된 for 문를 사용한 방법입니다:

```java
package util.list;

import java.util.List;

public class ListSum {

    /**
     * 리스트의 합을 향상된 for 문를 사용
     *
     * @param list 합을 구할 리스트
     * @return 리스트 요소들의 합
     */
    public int sumUsingEnhancedForLoop(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
```

### **장점:**
- **간결함:** 코드가 더 간결해집니다.

### **단점:**
- **제어력 부족:** 전통적인 for 문와 달리 인덱스 제어나 변형은 어렵습니다.

## 3. 스트림 API를 사용한 합 구하기

Java 8부터 도입된 스트림 API를 사용하면 더 간결하고 함수형 프로그래밍 스타일의 코드를 작성할 수 있습니다.

다음은 스트림 API를 사용한 방법입니다:

```java
package util.list;

import java.util.List;

public class ListSum {

    /**
     * 리스트의 합을 스트림 API를 사용
     *
     * @param list 합을 구할 리스트
     * @return 리스트 요소들의 합
     */
    public int sumUsingStreams(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
```

### **장점:**
- **가독성:** 코드가 매우 간결하고 읽기 쉽습니다.
- **함수형 프로그래밍:** 최신 자바에서 선호되는 함수형 프로그래밍 패러다임을 활용합니다.

### **단점:**
- **성능 오버헤드:** 스트림은 약간의 성능 오버헤드를 수반하지만, 대부분의 경우 이는 무시할 수 있습니다.

## 4. 스트림의 reduce 메서드를 사용한 합 구하기

스트림의 `reduce` 메서드를 사용하면 더 제어된 방식으로 요소들을 합칠 수 있습니다.

다음은 스트림의 `reduce` 메서드를 사용한 방법입니다:

```java
package util.list;

import java.util.List;

public class ListSum {

    /**
     * 리스트의 합을 스트림의 reduce 메서드를 사용
     *
     * @param list 합을 구할 리스트
     * @return 리스트 요소들의 합
     */
    public int sumUsingStreamReduce(List<Integer> list) {
        return list.stream()
                .reduce(0, Integer::sum);
    }
}
```

### **장점:**
- **유연성:** 다양한 연산을 수행하는데 유연하게 사용할 수 있습니다.

### **단점:**
- **가독성:** 단순한 합계의 경우 다른 방식보다 이해하기 어려울 수 있습니다.

## 5. 재귀 호출을 사용한 합 구하기

재귀 호출을 사용하면 반복문 없이도 합을 구할 수 있지만, 스택 오버플로우와 같은 문제가 발생할 수 있습니다.

다음은 재귀 호출을 사용한 방법입니다:

```java
package util.list;

import java.util.List;

public class ListSum {

    /**
     * 리스트의 합을 재귀 호출을 사용
     *
     * @param list 합을 구할 리스트
     * @return 리스트 요소들의 합
     */
    public int sumUsingRecursion(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        return sumListRecursive(list, list.size() - 1);
    }

    private int sumListRecursive(List<Integer> list, int index) {
        if (index == 0) {
            return list.get(index);
        }
        return list.get(index) + sumListRecursive(list, index - 1);
    }
}
```

### **장점:**
- **재귀적 사고:** 복잡한 문제를 쉽게 해결할 수 있습니다.

### **단점:**
- **성능:** 큰 리스트에서는 성능이 떨어지고 스택 오버플로우가 발생할 수 있습니다.

## 6. 병렬 스트림을 사용한 합 구하기

병렬 스트림을 사용하면 리스트 요소들의 합을 더 빠르게 구할 수 있습니다.

다음은 병렬 스트림을 사용한 방법입니다:

```java
package util.list;

import java.util.List;

public class ListSum {

    /**
     * 리스트의 합을 병렬 스트림을 사용
     *
     * @param list 합을 구할 리스트
     * @return 리스트 요소들의 합
     */
    public int sumUsingParallelStream(List<Integer> list) {
        return list.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
```

### **장점:**
- **성능:** 병렬 처리를 통해 성능 향상을 기대할 수 있습니다.

### **단점:**
- **복잡성:** 병렬 스트림의 사용법이 다소 복잡할 수 있으며, 작은 리스트에서는 오히려 성능이 저하될 수 있습니다.

## 결론

결론적으로, 자바에서 리스트의 합을 구하는 방법은 다양합니다. 상황에 따라 가장 적합한 방법을 선택하여 사용할 수 있습니다. 일반적으로 스트림 API는 간결성과 가독성 측면에서 많이 선호되며, 전통적인 for 문 또한 여전히 널리 사용됩니다.