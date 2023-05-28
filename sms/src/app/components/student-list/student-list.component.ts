import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from 'src/app/model/Student';
import { StudentService } from 'src/app/student.service';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent {
students:Student[]=[];
  constructor(public service:StudentService, public router:Router){
  this.getStudents();
  }

  getStudents():any{
    return this.service.getStudents().subscribe((data: any[]) => 
      this.students=data)
    }
}
