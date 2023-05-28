import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from 'src/app/model/Student';
import { StudentService } from 'src/app/student.service';

@Component({
  selector: 'app-add-student',
  templateUrl: './add-student.component.html',
  styleUrls: ['./add-student.component.css']
})
export class AddStudentComponent {

  student:Student={
    firstName:'',
lastName:'',
dob:'',
parentsName:'',
address:'',
city:'',
phone:''
  }

  constructor(public router:Router,public service:StudentService){

  }


goToList(){
  this.router.navigate(['/studentlist']);
  }

  onSubmit(student:Student){
return this.service.saveStudent(student).subscribe(data=>{ console.log(data)
this.goToList();
});
}

}
