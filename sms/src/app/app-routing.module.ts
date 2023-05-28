import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddStudentComponent } from './components/add-student/add-student.component';
import { StudentListComponent } from './components/student-list/student-list.component';

const routes: Routes = [
  {path:"addstudent",component:AddStudentComponent},
  {path:"studentlist",component:StudentListComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
