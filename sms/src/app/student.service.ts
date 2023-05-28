import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Student } from './model/Student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
data:any;
  url="http://localhost:8090";
  constructor(public httpClient:HttpClient) {
   
   }

  getStudents():any{
    return this.httpClient.get<Student[]>(`${this.url}/${"students"}`);
  }

 
  saveStudent(student:Student){
    return this.httpClient.post(`${this.url}/${"addstudent"}`,student);
  }
}