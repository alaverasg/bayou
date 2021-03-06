/*
  Copyright 2017 Rice University

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
*/

// irrelevant loop
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.File;

class Main {
  public main() {
    for(int i = 0; i < 10; ++i) {
      System.out.println("for1.");
      System.out.println("for2.");
    }
    while(true) {
      System.out.println("loop1.");
      System.out.println("loop2.");
    }
    if(false) {
      int[] array = {1, 2, 3};
      for(int i : array) {
        System.out.println(i);
      }
    }
  }
}
