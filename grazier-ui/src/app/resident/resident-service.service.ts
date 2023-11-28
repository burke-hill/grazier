import { Resident } from './resident';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ResidentServiceService {

  private addResidentUrl: string;
  private getResidentsUrl: string;

  constructor(private http:HttpClient) { 
    this.addResidentUrl = 'localhost:8080/resident/addResident'
    this.getResidentsUrl = 'localhost:8080/resident/getResidents'
  }

  public findAll(): Observable<Resident[]> {
    return this.http.get<Resident[]>(this.getResidentsUrl);
  }

  public save(resident: Resident) {
    return this.http.post<Resident>(this.addResidentUrl, resident);
  }
}
